package com.feth.play.module.pa.controllers;

import play.mvc.Controller;
import play.mvc.Result;

import com.feth.play.module.pa.PlayAuthenticate;

public class AuthenticateController extends Controller {

	public static Result authenticate(final String provider) {
		return PlayAuthenticate.handleAuthentication(provider, ctx());
	}
}
