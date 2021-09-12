package com.vishwa.KafkaProducerApp.dto;

import java.util.Objects;


/**
 *
 */
public class MessageDTO {

  private String topic ;

  private String key ;

  private String value ;

  public String getTopic() {
    return topic;
  }

  public void setTopic(String topic) {
    this.topic = topic;
  }

  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return "MessageDTO{" + "topic='" + topic + '\'' + ", key='" + key + '\'' + ", value='" + value + '\'' + '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessageDTO that = (MessageDTO) o;
    return Objects.equals(topic, that.topic) && Objects.equals(key, that.key) && Objects.equals(value, that.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(topic, key, value);
  }
}
