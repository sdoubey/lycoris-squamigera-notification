package eu.lycoris.squamigera.notification.track;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;

import java.io.IOException;
import java.util.UUID;

import org.junit.Test;

import eu.lycoris.squamigera.notification.TestUtils;

public class TrackNotificationTest {

  @Test
  public void testTrackAddedNotification_canDeserialize() throws IOException {
    TrackAddedNotification notification =
        TrackAddedNotification.builder(
                UUID.randomUUID(), "My title", "My filename", "My source filename", "My hash")
            .build();

    String json = TestUtils.getObjectMapper().writeValueAsString(notification);

    TrackAddedNotification message =
        TestUtils.getObjectMapper().readValue(json, TrackAddedNotification.class);

    assertThat(message, is(notNullValue()));
  }

  @Test
  public void testTrackConvertionRequestedNotification_canDeserialize() throws IOException {
    TrackConvertionRequestedNotification notification =
        TrackConvertionRequestedNotification.builder(
                UUID.randomUUID(), "My title", "My filename", "My source filename", "My hash")
            .build();

    String json = TestUtils.getObjectMapper().writeValueAsString(notification);

    TrackConvertionRequestedNotification message =
        TestUtils.getObjectMapper().readValue(json, TrackConvertionRequestedNotification.class);

    assertThat(message, is(notNullValue()));
  }

  @Test
  public void testTrackConvertedNotification_canDeserialize() throws IOException {
    TrackConvertedNotification notification =
        TrackConvertedNotification.builder(
                UUID.randomUUID(), "My title", "My filename", "My source filename", "My hash")
            .build();

    String json = TestUtils.getObjectMapper().writeValueAsString(notification);

    TrackConvertedNotification message =
        TestUtils.getObjectMapper().readValue(json, TrackConvertedNotification.class);

    assertThat(message, is(notNullValue()));
  }

  @Test
  public void testTrackConvertionFailedNotification_canDeserialize() throws IOException {
    TrackConvertionFailedNotification notification =
        TrackConvertionFailedNotification.builder(UUID.randomUUID(), "My reason").build();

    String json = TestUtils.getObjectMapper().writeValueAsString(notification);

    TrackConvertionFailedNotification message =
        TestUtils.getObjectMapper().readValue(json, TrackConvertionFailedNotification.class);

    assertThat(message, is(notNullValue()));
  }

  @Test
  public void testTrackConvertionStartedNotification_canDeserialize() throws IOException {
    TrackConvertionStartedNotification notification =
        TrackConvertionStartedNotification.builder(UUID.randomUUID()).build();

    String json = TestUtils.getObjectMapper().writeValueAsString(notification);

    TrackConvertionStartedNotification message =
        TestUtils.getObjectMapper().readValue(json, TrackConvertionStartedNotification.class);

    assertThat(message, is(notNullValue()));
  }

  @Test
  public void testTrackConvertionDelayedNotification_canDeserialize() throws IOException {
    TrackConvertionDelayedNotification notification =
        TrackConvertionDelayedNotification.builder(UUID.randomUUID()).build();

    String json = TestUtils.getObjectMapper().writeValueAsString(notification);

    TrackConvertionDelayedNotification message =
        TestUtils.getObjectMapper().readValue(json, TrackConvertionDelayedNotification.class);

    assertThat(message, is(notNullValue()));
  }
}
