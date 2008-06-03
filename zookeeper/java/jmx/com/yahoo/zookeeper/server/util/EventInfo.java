/**
 * Copyright 2008, Yahoo! Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.yahoo.zookeeper.server.util;

/**
 * A helper interface used to make event generation and dispatching more 
 * consistent. An instance of the interface is normally used as the second 
 * argument to the {@link ObserverManager#notifyObservers()} call.
 * 
 * @see ObservableDataTree implements the interface 
 */
public interface EventInfo {
    public void dispatch(Object source, Object observer);
}
