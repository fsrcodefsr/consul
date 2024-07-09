2 containerized microservices consul-client and consul-demo,
which are registered through Consul, and when consul-client wants
to receive data from consul-demo, it requests an address from Consul,
that is, the services find each other dynamically, without having to
specify static addresses and ports (Service Discovery).