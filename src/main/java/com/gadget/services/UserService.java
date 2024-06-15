package com.gadget.services;

import com.gadget.dao.entity.User;
import com.gadget.dao.entity.UserOnboard;
import com.gadget.dao.entity.enums.OnboardStatus;
import com.gadget.dao.entity.enums.Role;
import com.gadget.dao.repository.UserOnboardRepository;
import com.gadget.dao.repository.UserRepository;
import com.gadget.dto.auth.RegisterDto;
import com.gadget.dto.user.UserInputDto;
import com.gadget.exceptions.ConflictException;
import com.gadget.util.BCryptUtil;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Random;

@Service
public class UserService {

    private final UserRepository userRepository;
    private final UserOnboardRepository userOnboardRepository;
    private final ModelMapper modelMapper;

    public UserService(
            UserRepository userRepository,
            UserOnboardRepository userOnboardRepository,
            ModelMapper modelMapper
    ) {
        this.userRepository = userRepository;
        this.userOnboardRepository = userOnboardRepository;
        this.modelMapper = modelMapper;
    }

    public User createUser(UserInputDto userInputDto){
        User user = modelMapper.map(userInputDto, User.class);
        user.setPassword(BCryptUtil.createPassword(userInputDto.getPassword()));
        user.setCreatedAt(LocalDateTime.now());
        user.setUpdatedAt(LocalDateTime.now());
        return createUser(user);
    }

    public User createUser(RegisterDto registerDto) {
        User user = modelMapper.map(registerDto, User.class);
        user.setPassword(BCryptUtil.createPassword(registerDto.getPassword()));
        user.setRole(registerDto.getRole().toString());
        user.setCreatedAt(LocalDateTime.now());
        user.setUpdatedAt(LocalDateTime.now());
        return createUser(user);
    }

    private User createUser(User newUser) {
        // validate user
        User existingUser = findByEmail(newUser.getEmail());
        if (existingUser != null) {
            throw new ConflictException("There is a user with the same email.");
        }

        // create the user and assign it a random account manager
        User randomAccountManager = getRandomAccountManager();
        newUser.setActive(true);
        newUser.setAccountManager(randomAccountManager);
        userRepository.save(newUser);

        // create the onboarding record
        UserOnboard userOnboard = new UserOnboard();
        userOnboard.setUser(newUser);
        userOnboard.setAccountManager(randomAccountManager);
        userOnboard.setStatus(OnboardStatus.OPEN.toString());
        userOnboard.setCreatedAt(LocalDateTime.now());
        userOnboard.setUpdatedAt(LocalDateTime.now());
        userOnboardRepository.save(userOnboard);

        return newUser;
    }

    public void markAsVerified(User user) {
        user.setVerified(true);
        user.setUpdatedAt(LocalDateTime.now());
        userRepository.save(user);
    }

    public void updatePassword(User user, String password) {
        user.setPassword(BCryptUtil.createPassword(password));
        user.setUpdatedAt(LocalDateTime.now());
        userRepository.save(user);
    }

    public User findByEmail(String email) {
        return userRepository.findByEmailIgnoreCase(email);
    }

    public void updateOnboardStatusByUser(User user, OnboardStatus status) {
        UserOnboard onboard = userOnboardRepository.findByUserId(user.getId());
        onboard.setStatus(status.toString());
        userOnboardRepository.save(onboard);
    }

    private User getRandomAccountManager() {
        List<User> accountManagers = userRepository.findByRole(Role.ACCOUNT_MANAGER);
        return accountManagers.get(new Random().nextInt(accountManagers.size()));
    }

}
