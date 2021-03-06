/*
 * Copyright 2017-2019 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.cloud.dataflow.rest.resource.about;

import java.util.ArrayList;
import java.util.List;

/**
 * Provides information about the runtime environment.
 *
 * @author Gunnar Hillert
 * @author Ilayaperumal Gopinathan
 */
public class RuntimeEnvironment {

	/**
	 * The {@link RuntimeEnvironmentDetails} of the app deployer.
	 */
	private RuntimeEnvironmentDetails appDeployer = new RuntimeEnvironmentDetails();

	/**
	 * The {@link RuntimeEnvironmentDetails} of the task launcher.
	 */
	private List<RuntimeEnvironmentDetails> taskLaunchers = new ArrayList<RuntimeEnvironmentDetails>();

	/**
	 * Default constructor for serialization frameworks.
	 */
	public RuntimeEnvironment() {
	}

	/**
	 * @return Null, if the stream feature is disabled
	 */
	public RuntimeEnvironmentDetails getAppDeployer() {
		return appDeployer;
	}

	public void setAppDeployer(RuntimeEnvironmentDetails appDeployer) {
		this.appDeployer = appDeployer;
	}

	/**
	 * @return Null, if the task feature is disabled
	 */
	public List<RuntimeEnvironmentDetails> getTaskLaunchers() {
		return taskLaunchers;
	}

	public void setTaskLaunchers(List<RuntimeEnvironmentDetails> taskLaunchers) {
		this.taskLaunchers = taskLaunchers;
	}

}
