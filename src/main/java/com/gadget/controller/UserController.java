package com.gadget.controller;

import com.gadget.dao.entity.User;
import com.gadget.dto.generated.ErrorDto;
import com.gadget.dto.generated.UserOutputDto;
import com.gadget.dto.user.UserInputDto;
import com.gadget.services.UserService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/user")
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(
            UserService userService
    ) {
        this.userService = userService;
    }

    /**
     * POST /api/user : Create user
     *
     * @param userInputDto (required)
     * @return Successful (status code 201)
     * or Bad Request (status code 400)
     * or Unauthorized (status code 401)
     * or Not Found (status code 404)
     */
    @Operation(summary = "Create user", operationId = "userControllerCreateUser")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Successful", content = {@Content(mediaType = "application/json", schema = @Schema(implementation = UserOutputDto.class))}),
            @ApiResponse(responseCode = "400", description = "Bad Request", content = {@Content(mediaType = "application/json", schema = @Schema(implementation = ErrorDto.class))}),
            @ApiResponse(responseCode = "401", description = "Unauthorized", content = {@Content(mediaType = "application/json", schema = @Schema(implementation = ErrorDto.class))}),
            @ApiResponse(responseCode = "404", description = "Not Found", content = {@Content(mediaType = "application/json", schema = @Schema(implementation = ErrorDto.class))}),
    })
    @RequestMapping(
            method = RequestMethod.POST,
            produces = {"application/json"},
            consumes = {"application/json"}
    )
    public User userControllerCreateUser(@Parameter(name = "User Object", required = true) @Valid @RequestBody UserInputDto userInputDto) {
        return userService.createUser(userInputDto);

    }
}
