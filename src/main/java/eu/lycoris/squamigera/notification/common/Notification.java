package eu.lycoris.squamigera.notification.common;

import com.fasterxml.jackson.annotation.JsonCreator;

import eu.lycoris.spring.common.LycorisSubjectMessage;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@AllArgsConstructor(onConstructor_ = @JsonCreator)
public class Notification implements LycorisSubjectMessage{

  private String subject;
}
