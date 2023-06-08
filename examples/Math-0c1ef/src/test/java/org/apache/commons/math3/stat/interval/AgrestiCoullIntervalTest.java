/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.commons.math3.stat.interval;

import org.apache.commons.math3.stat.interval.AgrestiCoullInterval;
import org.apache.commons.math3.stat.interval.BinomialConfidenceInterval;
import org.apache.commons.math3.stat.interval.ConfidenceInterval;
import org.junit.Assert;
import org.junit.Test;

/**
 * Test cases for the AgrestiCoullInterval class.
 *
 */
public class AgrestiCoullIntervalTest extends BinomialConfidenceIntervalAbstractTest {

    @Override
    protected BinomialConfidenceInterval createBinomialConfidenceInterval() {
        return new AgrestiCoullInterval();
    }
    
    @Test
    public void testStandardInterval() {
        ConfidenceInterval confidenceInterval = createStandardTestInterval();
        Assert.assertEquals(0.07993521, confidenceInterval.getLowerBound(), 1E-5);
        Assert.assertEquals(0.1243704, confidenceInterval.getUpperBound(), 1E-5);
    }

}
