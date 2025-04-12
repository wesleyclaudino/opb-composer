# One Percent Better - Backend
Backend of One Percent Better product

# Run opb-server with docker
To run the opb-server module you will need docker

It's necessary to configure your environment file. For this, create the `application-dev.env` file in root dir.
```bash
touch ./opb-server/application-dev.env
```

Configure your environments in `application-dev.env`:
- `POSTGRES_DB=database_name`
- `POSTGRES_USER=database_user`
- `POSTGRES_PASSWORD=database_password`
- `POSTGRES_URI=database_uri`

To build and run the docker image move to opb-server directory and build your docker
```bash
cd ./opb-server && docker-compose up --build
```