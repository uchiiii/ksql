/*
 * Copyright 2022 Confluent Inc.
 *
 * Licensed under the Confluent Community License; you may not use this file
 * except in compliance with the License.  You may obtain a copy of the License at
 *
 * http://www.confluent.io/confluent-community-license
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OF ANY KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations under the License.
 */

package io.confluent.ksql.function.types;

public final class AnyType extends ObjectType {
  public static final AnyType INSTANCE = new AnyType();

  @Override
  public int hashCode() {
    return 11;
  }

  @Override
  public boolean equals(final Object obj) {
    return obj instanceof AnyType;
  }

  @Override
  public String toString() {
    return "ANY";
  }
}
