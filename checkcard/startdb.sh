#!bin/bash
docker run --name checkcard -e POSTGRES_PASSWORD=developer2 \
  -p 5432:5432 \
  -v /home/developer2/IdeaProjects/data/:/var/dir/postgresql/data  \
  -d  postgres:12.1
