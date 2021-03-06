/**
 * generated by Xtext 2.12.0
 */
package linit.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import linit.LinitRuntimeModule;
import linit.LinitStandaloneSetup;
import linit.ide.LinitIdeModule;
import org.eclipse.xtext.util.Modules2;

/**
 * Initialization support for running Xtext languages as language servers.
 */
@SuppressWarnings("all")
public class LinitIdeSetup extends LinitStandaloneSetup {
  @Override
  public Injector createInjector() {
    LinitRuntimeModule _linitRuntimeModule = new LinitRuntimeModule();
    LinitIdeModule _linitIdeModule = new LinitIdeModule();
    return Guice.createInjector(Modules2.mixin(_linitRuntimeModule, _linitIdeModule));
  }
}
