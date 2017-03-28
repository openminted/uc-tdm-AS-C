/*
Copyright 2016, 2017 Institut National de la Recherche Agronomique

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

        http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/


package alvisnlp.module;

public abstract class AbstractModuleVisitor<A extends Annotable,P> implements ModuleVisitor<A,P> {
	@Override
	public void visitSequence(Sequence<A> sequence, P param) throws ModuleException {
		for (Module<A> module : sequence.getSubModules())
			module.accept(this, param);
	}

	@Override
	public void visitParam(ParamHandler<A> paramHandler, P param) throws ModuleException {
	}
}
