## CentOS 7 with Jenkins CASC

[![build_status](https://travis-ci.org/aem-design/docker-jenkins-base.svg?branch=master)](https://travis-ci.org/aem-design/docker-jenkins-base) 
[![github license](https://img.shields.io/github/license/aem-design/jenkins-base)](https://github.com/aem-design/jenkins-base) 
[![github issues](https://img.shields.io/github/issues/aem-design/jenkins-base)](https://github.com/aem-design/jenkins-base) 
[![github last commit](https://img.shields.io/github/last-commit/aem-design/jenkins-base)](https://github.com/aem-design/jenkins-base) 
[![github repo size](https://img.shields.io/github/repo-size/aem-design/jenkins-base)](https://github.com/aem-design/jenkins-base) 
[![docker stars](https://img.shields.io/docker/stars/aemdesign/jenkins-base)](https://hub.docker.com/r/aemdesign/jenkins-base) 
[![docker pulls](https://img.shields.io/docker/pulls/aemdesign/jenkins-base)](https://hub.docker.com/r/aemdesign/jenkins-base) 
[![github release](https://img.shields.io/github/release/aem-design/jenkins-base)](https://github.com/aem-design/jenkins-base)

This is docker image based on [aemdesign/oracle-jdk](https://hub.docker.com/r/aemdesign/oracle-jdk/) with Jenkins CASC and build pack integrated

One image for Jenkins Master, Slave and build agent

### Included Packages

Following is the list of packages included

* node                  - for managing node projects
* nvm                   - for managing node versions
* maven                 - for managing of builds
* python                - for ansible playbooks
* chrome                - for headless tests
* groovy                - for pipeline creation
* jenkins               - for managing pipelines

### Configured Plugins
| Plugin Name | Version |
|------------------------------------|------------|
| ace-editor| latest |
| apache-httpcomponents-client-4-api| latest |
| authentication-tokens| latest |
| branch-api| latest |
| cloudbees-folder| latest |
| credentials-binding| latest |
| credentials| latest |
| display-url-api| latest |
| docker-commons| latest |
| docker-workflow| latest |
| durable-task| latest |
| git-client| latest |
| git-server| latest |
| git| latest |
| jackson2-api| latest |
| job-dsl| 1.74 |
| jquery-detached| latest |
| jsch| latest |
| junit| latest |
| mailer| latest |
| matrix-project| latest |
| pipeline-input-step| latest |
| pipeline-model-api| latest |
| pipeline-model-declarative-agent| latest |
| pipeline-model-definition| latest |
| pipeline-model-extensions| latest |
| pipeline-stage-step| latest |
| pipeline-stage-tags-metadata| latest |
| pipeline-utility-steps| latest |
| plain-credentials| latest |
| scm-api| latest |
| script-security| latest |
| ssh-credentials| latest |
| structs| latest |
| trilead-api| latest |
| workflow-api| latest |
| workflow-basic-steps| latest |
| workflow-cps-global-lib| latest |
| workflow-cps| latest |
| workflow-durable-task-step| latest |
| workflow-job| latest |
| workflow-multibranch| latest |
| workflow-scm-step| latest |
| workflow-step-api| latest |
| workflow-support| latest |
| configuration-as-code| latest |
| matrix-auth| latest |
| github-oauth| latest |
| bitbucket-oauth| latest |
| google-oauth-plugin| latest |

### Usage

> docker run -v jenkins_home:/var/jenkins_home -v $(pwd)/praqma-jenkins-casc/casc_configs:/var/jenkins_conf -p 8080:8080 aemdesign/jenkins-base

and praqma-jenkins-casc contains sample CASC configurations, it can be cloned from https://github.com/Praqma/praqma-jenkins-casc
