package se.rtinnovation.spring.docker.server.rest;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Version;
import java.io.Serializable;
import java.util.List;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class ServicePayload implements Serializable {

    @Id
    private UUID id;

    private List<String> answers;

    @Version
    private long version;
}
