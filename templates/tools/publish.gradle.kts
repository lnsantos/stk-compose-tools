plugins {
    id("maven-publish")
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            groupId = "{{group_id}}"
            artifactId = "{{artifact_id}}"
            version = "0.0.1"

            from(components["java"])
        }
    }
}