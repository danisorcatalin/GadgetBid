In order to create the first time the project run this and after run DockerFile local check if the pass is changed
docker run -d
    --name gadgetbid-db
    -p 5432:5432
    -e POSTGRES_USER=gadget-mngr
    -e POSTGRES_PASSWORD=sdfGSDFGSDf65gsd4f4gsdfGSDF
    -e POSTGRES_DB=gadgetbid
    postgres