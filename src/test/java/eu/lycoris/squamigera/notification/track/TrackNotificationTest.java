package eu.lycoris.squamigera.notification.track;

import java.io.IOException;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;
import java.util.UUID;

import org.junit.Test;

import eu.lycoris.squamigera.notification.TestUtils;

public class TrackNotificationTest {

  @Test
  public void testConvertTrackNotification_canDeserialize() throws IOException {
    ConvertTrackNotification notification =
        ConvertTrackNotification.builder(UUID.randomUUID(), "My title", "My filename", "My hash")
            .build();

    String json = TestUtils.getObjectMapper().writeValueAsString(notification);

    ConvertTrackNotification message =
        TestUtils.getObjectMapper().readValue(json, ConvertTrackNotification.class);

    assertThat(message, is(notNullValue()));
  }

  @Test
  public void testTrackConvertedNotification_canDeserialize() throws IOException {
    TrackConvertedNotification notification =
        TrackConvertedNotification.builder(UUID.randomUUID(), "My title", "My filename", "My hash")
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
}
