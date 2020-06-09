# Customemetrics
Spring Boot Custom Metrics Project.
This Project i have added 95 % and 99 % latency for REST API and Integrated that with Prometheus and Graphana 
#### Added My own custom metric for method execution duration
* Steps to be followed 
* 1 `gradlew bootRun`
* 2  Pull Prometheus docker Image
`docker pull prom/prometheus`
* 3  Configure Prometheus and graphana[ Follw the Link] (https://www.callicoder.com/spring-boot-actuator-metrics-monitoring-dashboard-prometheus-grafana/)
* 4 Run Prometheus Image

`docker run -d --name=prometheus -p 9090:9090 -v /Users/kkarthika/research/Course-material/PluralSight/prometheus.yml:/etc/prometheus/prometheus.yml prom/prometheus --config.file=/etc/prometheus/prometheus.yml`
