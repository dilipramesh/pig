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
package org.apache.pig.newplan.logical.rules;

import org.apache.pig.impl.PigContext;
import org.apache.pig.newplan.OperatorPlan;
import org.apache.pig.newplan.logical.relational.LOFilter;
import org.apache.pig.newplan.logical.relational.LogicalPlan;
import org.apache.pig.newplan.logical.relational.LogicalRelationalOperator;

public class FilterConstantCalculator extends ConstantCalculator {

    public FilterConstantCalculator(String n, PigContext pc) {
        super(n, pc);
    }

    @Override
    protected OperatorPlan buildPattern() {
        LogicalPlan plan = new LogicalPlan();
        LogicalRelationalOperator op = new LOFilter(plan);
        plan.add(op);
        return plan;
    }
}
