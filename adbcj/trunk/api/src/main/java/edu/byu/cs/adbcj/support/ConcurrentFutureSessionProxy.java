/*
 *   Copyright (c) 2007 Mike Heath.  All rights reserved.
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 *
 */
package edu.byu.cs.adbcj.support;

import java.util.concurrent.Future;

import edu.byu.cs.adbcj.DbSessionFuture;
import edu.byu.cs.adbcj.Session;

public class ConcurrentFutureSessionProxy<T> extends ConcurrentFutureProxy<T> implements DbSessionFuture<T> {

	private final Session session;
	
	public ConcurrentFutureSessionProxy(Session session) {
		this.session = session;
	}
	
	public ConcurrentFutureSessionProxy(Future<T> future, Session session) {
		super(future);
		this.session = session;
	}
	
	public Session getSession() {
		return session;
	}

}
