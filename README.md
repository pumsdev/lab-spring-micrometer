# About this project
This project use for setting up lab for test using Spring Micrometer to 
produce application metrics and use Prometheus for collector metrics and 
visualize in Grafana


additional: use Conduktor for connect to Kafka 
# Note
please replace this before run project
```sh
${YOUR_APP_IP:PORT} with your local network ip address
${YOUR_KAFKA_IP:PORT} with ${YOUR_APP_IP}:9092
```

# Step

1. start spring boot project it's will run on 8082
2. `docker compose up -d` it will start following service
    - kafka:9092
    - prometheus:9090
    - grafana:3000
    - postgres for conduktor
    - conduktor:8080

grafana
```
user: admin
password: grafana
```






