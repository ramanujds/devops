Steps to configure Prometheus

helm search hub Prometheus

helm repo add prometheus-community https://prometheus-community.github.io/helm-charts

helm repo update

helm install prometheus prometheus-community/prometheus --version 27.8.0


helm repo add grafana https://grafana.github.io/helm-charts

helm repo update


helm install grafana grafana/grafana --version 8.12.0


minikube service grafana --url

kubectl expose service prometheus-server --type=NodePort --target-port=9090 --name=prometheus-server-ext


Add datasource:

Copy url for prometheus-server-ext (first one)

Create a dashboard

Import Dashboard

input id: 315

Mention data source as prometheus