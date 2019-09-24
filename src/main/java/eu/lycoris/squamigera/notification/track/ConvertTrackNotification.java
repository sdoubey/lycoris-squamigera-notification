package eu.lycoris.squamigera.notification.track;

import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonCreator;

import eu.lycoris.squamigera.notification.common.Notification;
import lombok.Builder;
import lombok.Getter;
import lombok.NonNull;
import lombok.ToString;

@Getter
@ToString(callSuper = true)
public class ConvertTrackNotification extends Notification {

  public static final String SUBJECT = "CONVERT_TRACK_NOTIFICATION";

  public static ConvertTrackNotificationBuilder builder(
      @NonNull UUID id, @NonNull String title, @NonNull String fileName, @NonNull String fileHash) {
    return new ConvertTrackNotificationBuilder()
        .subject(SUBJECT)
        .id(id)
        .title(title)
        .fileName(fileName)
        .fileHash(fileHash);
  }

  private UUID id;

  private String title;

  private String fileName;

  private String fileHash;

  private String artistName;

  private Integer duration;

  private String coverUrl;

  @Builder
  @JsonCreator
  protected ConvertTrackNotification(
      String subject,
      UUID id,
      String title,
      String fileName,
      String fileHash,
      String artistName,
      Integer duration,
      String coverUrl) {
    super(subject);
    this.id = id;
    this.title = title;
    this.fileName = fileName;
    this.fileHash = fileHash;
    this.artistName = artistName;
    this.duration = duration;
    this.coverUrl = coverUrl;
  }
}
