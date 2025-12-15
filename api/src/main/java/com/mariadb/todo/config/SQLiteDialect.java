package com.mariadb.todo.config;

import org.hibernate.dialect.Dialect;
import org.hibernate.dialect.function.StandardSQLFunction;
import org.hibernate.type.descriptor.java.StringType;

public class SQLiteDialect extends Dialect {
    public SQLiteDialect() {
        registerFunction("lower", new StandardSQLFunction("lower", StringType.INSTANCE));
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
