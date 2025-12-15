package com.mariadb.todo.config;

import org.hibernate.dialect.Dialect;
import org.hibernate.dialect.function.StandardSQLFunction;
import org.hibernate.type.StandardBasicTypes;
import org.hibernate.query.sqm.function.FunctionRegistry; 

public class SQLiteDialect extends Dialect {
    

    @Override
    protected void initializeFunctionRegistry(FunctionRegistry functionRegistry) { 
        super.initializeFunctionRegistry(functionRegistry);
        
        functionRegistry.register(
            "lower", 
            new StandardSQLFunction("lower", StandardBasicTypes.STRING)
        );
    }

    
    public SQLiteDialect() {
        
    }

    @Override
    public boolean dropConstraints() {
        return false;
    }

}