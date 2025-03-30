package com.mycompany.myapp.domain;

import com.mycompany.myapp.domain.enumeration.Status;
import jakarta.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * A Message.
 */
@Entity
@Table(name = "message")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@SuppressWarnings("common-java:DuplicatedBlocks")
public class Message implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    @Column(name = "id")
    private Long id;

    @Column(name = "priority")
    private Integer priority;

    @Column(name = "topic")
    private String topic;

    @Column(name = "data")
    private String data;

    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    private Status status;

    @Column(name = "received_at")
    private LocalDate receivedAt;

    // jhipster-needle-entity-add-field - JHipster will add fields here

    public Long getId() {
        return this.id;
    }

    public Message id(Long id) {
        this.setId(id);
        return this;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getPriority() {
        return this.priority;
    }

    public Message priority(Integer priority) {
        this.setPriority(priority);
        return this;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public String getTopic() {
        return this.topic;
    }

    public Message topic(String topic) {
        this.setTopic(topic);
        return this;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getData() {
        return this.data;
    }

    public Message data(String data) {
        this.setData(data);
        return this;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Status getStatus() {
        return this.status;
    }

    public Message status(Status status) {
        this.setStatus(status);
        return this;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public LocalDate getReceivedAt() {
        return this.receivedAt;
    }

    public Message receivedAt(LocalDate receivedAt) {
        this.setReceivedAt(receivedAt);
        return this;
    }

    public void setReceivedAt(LocalDate receivedAt) {
        this.receivedAt = receivedAt;
    }

    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Message)) {
            return false;
        }
        return getId() != null && getId().equals(((Message) o).getId());
    }

    @Override
    public int hashCode() {
        // see https://vladmihalcea.com/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
        return getClass().hashCode();
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "Message{" +
            "id=" + getId() +
            ", priority=" + getPriority() +
            ", topic='" + getTopic() + "'" +
            ", data='" + getData() + "'" +
            ", status='" + getStatus() + "'" +
            ", receivedAt='" + getReceivedAt() + "'" +
            "}";
    }
}
