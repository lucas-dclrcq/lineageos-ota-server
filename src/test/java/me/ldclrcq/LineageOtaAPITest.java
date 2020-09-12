package me.ldclrcq;

import org.junit.jupiter.api.Test;

import javax.ws.rs.core.MediaType;
import java.net.HttpURLConnection;
import java.util.UUID;

import static io.restassured.RestAssured.given;

public class LineageOtaAPITest {
    public final static String LINEAGE_OTA_HOST = "https://download.lineageos.org";

    @Test
    public void test() {
        final String path = "/api/v1/<string:device>/<string:romtype>/<string:incrementalversion>"
                .replace("<string:device>", "sailfish")
                .replace("<string:romtype>", "nightly")
                .replace("<string:incrementalversion>", UUID.randomUUID().toString());

        given()
                .baseUri(LINEAGE_OTA_HOST)
                .header("Cache-control", "no-cache")
                .header("Content-type", MediaType.APPLICATION_JSON)
                .header("User-Agent", "com.cyanogenmod.updater/3.0")
                .queryParam("version", "17.1")
                .queryParam("after", "1595635200")
                .when()
                .get(path)
                .then()
                .log().everything()
                .statusCode(HttpURLConnection.HTTP_OK);
    }

    @Test
    public void testTypes() {
        String path = "/api/v1/types/<string:device>/"
                .replace("<string:device>", "sailfish");

        given()
                .baseUri(LINEAGE_OTA_HOST)
                .header("Cache-control", "no-cache")
                .header("Content-type", MediaType.APPLICATION_JSON)
                .header("User-Agent", "com.cyanogenmod.updater/3.0")
                .when()
                .get(path)
                .then()
                .log().everything()
                .statusCode(HttpURLConnection.HTTP_OK);
    }

    @Test
    public void testChanges() {
        String path = "/api/v1/changes/<device>/"
                .replace("<device>", "sailfish");

        given()
                .baseUri(LINEAGE_OTA_HOST)
                .header("Cache-control", "no-cache")
                .header("Content-type", MediaType.APPLICATION_JSON)
                .header("User-Agent", "com.cyanogenmod.updater/3.0")
                .when()
                .get(path)
                .then()
                .log().everything()
                .statusCode(HttpURLConnection.HTTP_OK);
    }

    @Test
    public void testDevices() {
        String path = "/api/v1/devices";

        given()
                .baseUri(LINEAGE_OTA_HOST)
                .header("Cache-control", "no-cache")
                .header("Content-type", MediaType.APPLICATION_JSON)
                .header("User-Agent", "com.cyanogenmod.updater/3.0")
                .when()
                .get(path)
                .then()
                .log().everything()
                .statusCode(HttpURLConnection.HTTP_OK);
    }
}
