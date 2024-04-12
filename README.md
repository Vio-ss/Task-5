# CI/CD Pipeline Configuration in Jenkins

This project demonstrates the setup and configuration of a simple CI/CD pipeline in Jenkins. (Windows commands in this case)

# Project Structure

![img](https://github.com/Vio-ss/Task-5/assets/77194486/6229dc8f-8995-4ed5-84d7-c304332a5204)

## Overview

Jenkins is a popular automation server used for building, testing, and deploying software. It supports the creation of pipelines, which allow you to define the entire software delivery process using code. In this project, we'll create a CI/CD pipeline with stages for building, testing, verifying, and deploying an application.

## Pipeline Stages

### 1. Build

This stage compiles the application using Maven.

### 2. Test

This stage runs automated tests to validate the application.

### 3. Verify

This stage performs additional verification tasks using Maven.

### 4. Deploy

This stage deploys the application (placeholder).

## Getting Started

To get started with the project, follow these instructions:

### Prerequisites

- Install Jenkins on your system.

### Installation

1. Create a new Jenkins pipeline job.

2. Configure the pipeline to use the provided Jenkinsfile or paste the pipeline script directly into the pipeline script section.

3. Save and run the pipeline job.

## Pipeline Configuration

```groovy
pipeline {
    agent any
    stages {
        stage('Build') {
           steps {
               bat "mvn clean package"
           }
        }
        stage('Test') {
            steps {
                bat "mvn test"
            }
        }
        stage('Verify') {
            steps {
                bat "mvn verify"
            }
        }
        stage('Deploy') {
            steps {
                echo "Deploy"
            }
        }
    }
    post {
        always {
            deleteDir()
        }
    }
}

