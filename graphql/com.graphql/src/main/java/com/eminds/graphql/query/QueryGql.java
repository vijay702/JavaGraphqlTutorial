package com.eminds.graphql.query;


k;
import org.springframework.stereotype.Component;

@Component
public class QueryGql implements GraphQLQueryResolver {


    public String test(){

        return  "Hello GraphQl";
    }


}
