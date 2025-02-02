/*
 * Copyright 2017-2020 original authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.micronaut.configuration.lettuce.pubsub.bind;

import io.micronaut.configuration.lettuce.pubsub.RedisMessage;
import io.micronaut.core.bind.TypeArgumentBinder;

/**
 * Allows binding by type.
 *
 * @param <T> The target type
 * @author Cristian Morales
 * @since TODO
 */
public interface TypedRedisMessageBinder<T> extends TypeArgumentBinder<T, RedisMessage>, RedisArgumentBinder<T> {
}
