# Gadgets-PoC: JVM Serializable Exploits

This repository contains a proof-of-concept (PoC) for exploiting Java Virtual Machine (JVM) serialization.

## Overview

The JVM provides a mechanism for persisting Java objects, known as serialization. This process involves converting the state of an object into a byte stream, which can then be reverted back into a copy of the object. However, this feature can be exploited, leading to what are known as "serialization vulnerabilities".

A common exploit involves the use of "gadgets", pre-existing pieces of code that can be manipulated to perform unintended actions. These gadgets are often found in libraries that the target application is using. An attacker can craft a serialized object that uses these gadgets to execute arbitrary code when it is deserialized.

## Running the Project

To run the project, use the following command:

```bash
./gradle bootRun
```


## Disclaimer
This project is a proof-of-concept for educational purposes only. It's a stark reminder of the importance of secure coding practices and the potential dangers of deserializing untrusted data. It's crucial to understand the risks associated with serialization and to implement appropriate safeguards when using this feature.

## License
This project is licensed under the MIT License - see the LICENSE file for details.