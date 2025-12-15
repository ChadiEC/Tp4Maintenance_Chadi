package com.mariadb.todo.config;

import org.hibernate.dialect.Dialect;
import org.hibernate.query.sqm.function.FunctionRegistry;
import org.hibernate.query.sqm.function.NamedSqmFunctionDescriptor;
import org.hibernate.type.StandardBasicTypes;

public class SQLiteDialect extends Dialect {

    public SQLiteDialect() {
        super();
    }

    @Override
    protected void initializeFunctionRegistry(FunctionRegistry functionRegistry) {
        super.initializeFunctionRegistry(functionRegistry);

        functionRegistry.register(
            "lower",
            new NamedSqmFunctionDescriptor(
                "lower",
                true,
                null,
                StandardBasicTypes.STRING
            )
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
