
## External Configuration
	**Repo:** `springboot-config-demo`


# External Configuration

## Overview

	Manage environment-specific settings using property and YAML files.

## Project Structure

	src/main/java/com/example/config
	├── ConfigApplication.java
	└── controller/ConfigController.java
	
	resources
	├── application.properties

	
## Key Concepts
	- `@Value` injection
	- `@ConfigurationProperties`
	- YAML vs properties
	- Environment variables override

## Run Locally

	mvn spring-boot:run
