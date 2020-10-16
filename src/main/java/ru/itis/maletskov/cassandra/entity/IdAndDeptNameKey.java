package ru.itis.maletskov.cassandra.entity;

import java.io.Serializable;
import java.util.UUID;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.cassandra.core.cql.PrimaryKeyType;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyClass;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;

@Data
@Builder
@PrimaryKeyClass
public class IdAndDeptNameKey implements Serializable {

    @PrimaryKeyColumn(name = "id", ordinal = 0, type = PrimaryKeyType.PARTITIONED)
    private UUID id;

    @PrimaryKeyColumn(name = "dept_name", ordinal = 1, type = PrimaryKeyType.CLUSTERED)
    private String deptName;
}
