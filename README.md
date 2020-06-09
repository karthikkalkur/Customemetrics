# Customemetrics
Spring Boot Custom Metrics Project.
### This Project i have added 95 % and 99 % latency for REST API and Integrtae that with Prometheus and Graphana 
### Added My own custom metric

### PULL PROMETHEUS docker Image

`docker pull prom/prometheus`
### RUN PROMETHEUS IMAGE 

`docker run -d --name=prometheus -p 9090:9090 -v /Users/kkarthika/research/Course-material/PluralSight/prometheus.yml:/etc/prometheus/prometheus.yml prom/prometheus --config.file=/etc/prometheus/prometheus.yml`

### PULL GRAPHAN IMAGE

` docker run -d --name=grafana -p 3000:3000 grafana/grafana`

I refered the following link https://www.callicoder.com/spring-boot-actuator-metrics-monitoring-dashboard-prometheus-grafana/
