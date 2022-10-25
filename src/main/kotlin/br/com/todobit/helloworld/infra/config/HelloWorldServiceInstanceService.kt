package br.com.todobit.helloworld.infra.config

import org.springframework.cloud.servicebroker.model.instance.CreateServiceInstanceRequest
import org.springframework.cloud.servicebroker.model.instance.CreateServiceInstanceResponse
import org.springframework.cloud.servicebroker.model.instance.DeleteServiceInstanceRequest
import org.springframework.cloud.servicebroker.model.instance.DeleteServiceInstanceResponse
import org.springframework.cloud.servicebroker.service.ServiceInstanceService
import org.springframework.stereotype.Service
import reactor.core.publisher.Mono

@Service
class HelloWorldServiceInstanceService: ServiceInstanceService {
    override fun createServiceInstance(request: CreateServiceInstanceRequest?): Mono<CreateServiceInstanceResponse> {
        TODO("Not yet implemented")
    }

    override fun deleteServiceInstance(request: DeleteServiceInstanceRequest?): Mono<DeleteServiceInstanceResponse> {
        TODO("Not yet implemented")
    }
}
