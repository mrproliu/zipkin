/*
 * Copyright 2015-2019 The OpenZipkin Authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */

package zipkin.server.core.services;

import org.apache.skywalking.oap.server.core.config.IComponentLibraryCatalogService;

public class EmptyComponentLibraryCatalogService implements IComponentLibraryCatalogService {
  @Override
  public int getComponentId(String componentName) {
    return 0;
  }

  @Override
  public int getServerIdBasedOnComponent(int componentId) {
    return 0;
  }

  @Override
  public String getComponentName(int componentId) {
    return null;
  }

  @Override
  public String getServerNameBasedOnComponent(int componentId) {
    return null;
  }

  @Override
  public boolean compare(int componentA, int componentB) {
    return false;
  }
}
