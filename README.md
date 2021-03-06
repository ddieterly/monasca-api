# Overview

`monasca-api` is a RESTful API server that is designed with a layered architecture [layered architecture](http://en.wikipedia.org/wiki/Multilayered_architecture).

## Build

Requires mon-common from https://github.com/hpcloud-mon/mon-common. Download and do mvn package.

```
mvn clean package
```

## Usage

```
java -jar target/mon-api.jar server config-file.yml
```

## Design Overview

### Architectural layers

Requests flow through the following architectural layers from top to bottom:

* Resource
  * Serves as the entrypoint into the service. 
  * Responsible for handling web service requests, and performing structural request validation.
* Application
  * Responsible for providing application level implementations for specific use cases.
* Domain
  * Contains the technology agnostic core domain model and domain service definitions.
  * Responsible for upholding invariants and defining state transitions.
* Infrastructure
  * Contains technology specific implementations of domain services.
  
## Documentation

* API Specification: [/docs/monasca-api-spec.md](/docs/monasca-api-spec.md).

# License

Copyright (c) 2014 Hewlett-Packard Development Company, L.P.

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0
    
Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
implied.
See the License for the specific language governing permissions and
limitations under the License.
