/*
 * Copyright 2010 JBoss Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.drools.eclipse.core;

public class DefaultRuleGroup extends RuleGroup {

    protected DefaultRuleGroup(Package parent, Rule rule, String groupName) {
        super(parent, rule, groupName);
        // TODO Auto-generated constructor stub
    }

    @Override
    public int getType() {
        // TODO Auto-generated method stub
        return DEFAULT_RULE_GROUP;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "*default*";
    }
}
