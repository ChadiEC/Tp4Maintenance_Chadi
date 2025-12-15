package com.mariadb.todo.config;

import org.hibernate.dialect.Dialect;
import org.hibernate.dialect.function.StandardSQLFunction;
import org.hibernate.type.StandardBasicTypes;
import org.hibernate.query.sqm.function.FunctionRegistry; 

public class SQLiteDialect extends Dialect {
    
    // Empty constructor is fine
    public SQLiteDialect() {
    }

    // This method is now used to register functions in Hibernate 6
    @Override
    protected void initializeFunctionRegistry(FunctionRegistry functionRegistry) {
        super.initializeFunctionRegistry(functionRegistry);
        
        // Use functionRegistry.register and StandardBasicTypes.STRING
        functionRegistry.register(
            "lower", 
            new StandardSQLFunction("lower", StandardBasicTypes.STRING)
        );
    }

    @Override
    public boolean dropConstraints() {
        return false;
    }

    @Override
    public boolean hasAlterTable() {
        return false;
    }

    @Override
    public boolean qualifyIndexName() {
        return false;
    }
}