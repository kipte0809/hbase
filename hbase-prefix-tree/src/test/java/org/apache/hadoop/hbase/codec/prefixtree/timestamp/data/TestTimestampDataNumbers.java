/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.hadoop.hbase.codec.prefixtree.timestamp.data;

import java.util.ArrayList;
import java.util.List;

import org.apache.hadoop.hbase.codec.prefixtree.timestamp.TestTimestampData;

public class TestTimestampDataNumbers implements TestTimestampData {

  private int shift = 8;

  @Override
  public List<Long> getInputs() {
    List<Long> d = new ArrayList<Long>();
    d.add(5L << shift);
    d.add(3L << shift);
    d.add(7L << shift);
    d.add(1L << shift);
    d.add(3L << shift);
    return d;
  }

  @Override
  public long getMinimum() {
    return 1L << shift;
  }

  @Override
  public List<Long> getOutputs() {
    List<Long> d = new ArrayList<Long>();
    d.add(1L << shift);
    d.add(3L << shift);
    d.add(5L << shift);
    d.add(7L << shift);
    return d;
  }

}
