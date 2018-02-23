/*
 * Copyright 2016 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.cloud.dataflow.server;

import java.lang.annotation.*;

import org.springframework.cloud.dataflow.server.config.EnableDataFlowServerConfiguration;
import org.springframework.context.annotation.Import;

/**
 * Activates a Spring Cloud Data Flow Server implementation.
 *
 * @author Josh Long
 */
@Target({ ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@Import(EnableDataFlowServerConfiguration.class)
public @interface EnableDataFlowServer {
}