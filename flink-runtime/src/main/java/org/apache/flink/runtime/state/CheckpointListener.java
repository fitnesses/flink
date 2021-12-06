/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.flink.runtime.state;

import org.apache.flink.annotation.Public;

/**
 * This interface must be implemented by functions/operations that want to receive a commit
 * notification once a checkpoint has been completely acknowledged by all participants.
 *
 * @deprecated This interface has been moved to {@link
 *     org.apache.flink.api.common.state.CheckpointListener}. This class is kept to maintain
 *     backwards compatibility and will be removed in future releases.
 */
@Public
@Deprecated
public interface CheckpointListener extends org.apache.flink.api.common.state.CheckpointListener {}
