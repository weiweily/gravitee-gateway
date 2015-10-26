/**
 * Copyright (C) 2015 The Gravitee team (http://gravitee.io)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.gravitee.gateway.standalone.repository;

import io.gravitee.repository.Repository;
import io.gravitee.repository.Scope;

/**
 * @author David BRASSELY (brasseld at gmail.com)
 */
public class MockRepository implements Repository {

    @Override
    public String type() {
        return "mock";
    }

    @Override
    public Scope[] scopes() {
        return new Scope[] {
            Scope.MANAGEMENT
        };
    }

    @Override
    public Class<?> configuration(Scope scope) {
        return RepositoryConfiguration.class;
    }
}