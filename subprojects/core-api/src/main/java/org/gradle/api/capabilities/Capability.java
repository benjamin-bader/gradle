/*
 * Copyright 2018 the original author or authors.
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
package org.gradle.api.capabilities;

import org.jspecify.annotations.Nullable;

/**
 * Represents a capability. Capabilities are versioned. Only one component for a specific capability
 * can be found on a dependency graph.
 *
 * @since 4.7
 */
public interface Capability {
    String getGroup();
    String getName();
    @Nullable
    String getVersion();
}
