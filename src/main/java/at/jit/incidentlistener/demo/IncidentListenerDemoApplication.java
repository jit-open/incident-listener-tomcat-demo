package at.jit.incidentlistener.demo;

import org.camunda.bpm.application.ProcessApplication;
import org.camunda.bpm.application.impl.ServletProcessApplication;

@ProcessApplication("Incident Listener Demo Application")
public class IncidentListenerDemoApplication extends ServletProcessApplication {
}
