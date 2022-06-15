package com.eminds.graphql_learning;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import reactor.core.publisher.Flux;

@SpringBootApplication
@AutoConfiguration("data.graphqls")
@Component
public class GraphQlLearningApplication {

    public static void main(String[] args) {
        SpringApplication.run(GraphQlLearningApplication.class, args);
    }




}

@Controller
class CustomerGraphQlController{

    private  final CustomerRepository customerRepository;

    CustomerGraphQlController(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }


    @SchemaMapping (typeName = "Query" ,field ="Customer" )
    Flux<Customer> customers(){

           return this.customerRepository.findAll();
       }
}

interface CustomerRepository extends  ReactiveCrudRepository<Customer,Integer>{


}

class Customer {

    @org.springframework.data.annotation.Id
    private Integer Id ;

    private String  name;
    private BankAccount bankAccount;


    public Customer(@JsonProperty("id") Integer id,@JsonProperty("name") String name) {
        Id = id;
        this.name = name;
    }
}

class BankAccount {

    private Integer id;
    private String name;

    public BankAccount(Integer id, String name) {
        this.id = id;
        this.name = name;
    }
}
