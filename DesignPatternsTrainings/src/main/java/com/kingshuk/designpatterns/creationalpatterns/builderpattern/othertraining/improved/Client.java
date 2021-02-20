package com.kingshuk.designpatterns.creationalpatterns.builderpattern.othertraining.improved;

public class Client {

	public static void main(String[] args){
		
		// setup the director
		QueryBuildDirector director = new QueryBuildDirector();
		String from="client table";
		String where="client name = ...";
		

		//Executing a SQL query
		QueryBuilder queryBuilder=new SqlQueryBuilder();
		Query query=director.buildQuery(from, where, queryBuilder);
		query.execute();

		//Then deciding to execute a mongoDB query
        queryBuilder= new MongoDbQueryBuilder();
        query=director.buildQuery(from, where, queryBuilder);
        query.execute();


	}
	
}
