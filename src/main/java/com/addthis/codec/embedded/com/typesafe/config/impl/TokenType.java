/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 *   Copyright (C) 2011-2012 Typesafe Inc. <http://typesafe.com>
 */
package com.addthis.codec.embedded.com.typesafe.config.impl;

enum TokenType {
    START,
    END,
    COMMA,
    EQUALS,
    COLON,
    OPEN_CURLY,
    CLOSE_CURLY,
    OPEN_SQUARE,
    CLOSE_SQUARE,
    VALUE,
    NEWLINE,
    UNQUOTED_TEXT,
    SUBSTITUTION,
    PROBLEM,
    COMMENT,
    PLUS_EQUALS;
}