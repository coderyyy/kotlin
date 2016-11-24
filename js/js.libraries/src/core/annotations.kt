/*
 * Copyright 2010-2016 JetBrains s.r.o.
 *
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

package kotlin.js

import kotlin.annotation.AnnotationTarget.*

@native
@Target(CLASS, FUNCTION, PROPERTY, CONSTRUCTOR, VALUE_PARAMETER, PROPERTY_GETTER, PROPERTY_SETTER)
@Deprecated("Use `external` modifier instead")
public annotation class native(@Deprecated public val name: String = "")

@native
@Target(FUNCTION)
@Deprecated
public annotation class nativeGetter

@native
@Target(FUNCTION)
@Deprecated
public annotation class nativeSetter

@native
@Target(FUNCTION)
@Deprecated
public annotation class nativeInvoke

@native
@Target(CLASS, FUNCTION, PROPERTY)
internal annotation class library(public val name: String = "")

@native
@Target(PROPERTY)
public annotation class enumerable()

@native
@Target(CLASS)
internal annotation class marker

@Retention(AnnotationRetention.BINARY)
@Target(CLASS, FUNCTION, PROPERTY, CONSTRUCTOR, PROPERTY_GETTER, PROPERTY_SETTER)
annotation class JsName(val name: String)

@Retention(AnnotationRetention.BINARY)
@Target(CLASS, PROPERTY, FUNCTION, FILE)
annotation class JsModule(val import: String)

@Retention(AnnotationRetention.BINARY)
@Target(CLASS, PROPERTY, FUNCTION, FILE)
annotation class JsNonModule