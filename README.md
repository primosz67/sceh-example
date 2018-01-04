# sceh-example
Spring CQRS Elastic Hateoas

CQRS = Axon?

### Kibana credentials ### 

login: elastic
password: changeme 

### Kibana Setup ###
indexName : "job_advertisement"

from: @Document(indexName = "job_advertisement", type = "advertisement")


### Elastic not so elastic ### 

For windows:
docker-machine ssh default 
$ sudo -i 
$ sysctl -w vm.max_map_count=262144

For linux just run : 
$ sudo -i 
$ sysctl -w vm.max_map_count=262144

