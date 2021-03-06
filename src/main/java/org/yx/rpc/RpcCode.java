/**
 * Copyright (C) 2016 - 2017 youtongluan.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * 		http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.yx.rpc;

public interface RpcCode {

	int UNKNOW = 300;

	int WAIT_TWICE = 310;

	int NO_ROUTE = 400;

	int NO_NODE_AVAILABLE = 410;

	int TIMEOUT = 420;

	int SEND_FAILED = 430;

	int SERVER_HANDLE_ERROR = 540;

	int SERVER_UNKNOW = 500;

}
